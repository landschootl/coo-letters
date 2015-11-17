
public class SimpleLetter extends Letter<TextContent>{
	protected final int COST_SIMPLE = 1;

public SimpleLetter(String content){
	super();
	this.content = new TextContent(content);
}

@Override
public double getCost() {
	return COST_SIMPLE;
}

@Override
public void doAction() {
	// TODO Auto-generated method stub
	
}

}
