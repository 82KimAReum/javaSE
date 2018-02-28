//6. interface끼리의 상속은 다중상속이며, extends를 사용한다. 
public interface Father extends GrandFather, GrandMother{
	String NAME = "Sujan";
	void father();
}
