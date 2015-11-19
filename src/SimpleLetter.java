
public class SimpleLetter extends Letter<TextContent>{


public SimpleLetter(String content){
	super();
	this.content = new TextContent(content);
}

@Override
public double getCost() {
	return BASE_COST;
}

@Override
public void doAction() {
	// TODO Auto-generated method stub
	
}

}
