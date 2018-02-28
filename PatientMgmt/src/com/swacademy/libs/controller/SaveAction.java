package com.swacademy.libs.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.swacademy.libs.model.PatientsVO;

public class SaveAction {
	private JPanel panel;
	private JFileChooser jfc;
	public SaveAction(JPanel panel){
		this.panel = panel;
		jfc = new JFileChooser(".");
		int choice = jfc.showSaveDialog(this.panel);
		if(choice == JFileChooser.CANCEL_OPTION) return;
		java.io.File file = jfc.getSelectedFile();
		PrintWriter pw = null;
		Vector<PatientsVO> vector = SelectController.select();
		try{
			pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			printLabel(pw);
			if(vector == null){
				JOptionPane.showMessageDialog(this.panel, "환자의 데이터가 존재하지 않습니다.");
				return;
			}
			for(int i = 0 ; i < vector.size() ; i++){
				PatientsVO p = vector.get(i);
				pw.printf("%2s%15s%15d%15d%15d\r\n",
						                     p.getNo(), p.getDepartment(),
						                     p.getJinchalfee(), p.getIpwonfee(),
						                     p.getSum());
			}
			JOptionPane.showMessageDialog(this.panel, file + "에 잘 저장됐습니다.");
		}catch(IOException ex){
			
		}finally{
			pw.close();
		}
	}
	private void printLabel(PrintWriter pw){
		pw.println("                       <<환자관리 프로그램>>");
		pw.println("------------------------------------------------------------");
		pw.println("번호          진찰부서              진찰비             입원비                  진료비");
		pw.println("------------------------------------------------------------");
	}

}
