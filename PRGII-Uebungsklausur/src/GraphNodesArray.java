import java.util.ArrayList;
import java.util.HashMap;


public class GraphNodesArray implements GraphNodesInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	//ArrayList<MapElement> arraylist = new ArrayList<>();
	HashMap<Integer, String> map = new HashMap<>();
	
	
	int index;
	
	public int addNode(String name) throws DuplicateNameException {
		if(map.containsValue(name)){
			throw new DuplicateNameException();
		}
		else {
			index++;			
			map.put(index, name);
		}
		
		return index;
	}

	public String getNode(int index) throws NodeNotFoundException {
		if(!map.containsKey(index)){
			throw new NodeNotFoundException();
		}
		return map.get(index);
	}

	public int getNode(String name) throws NodeNotFoundException {
		if(!map.containsValue(name))
		{ throw new NodeNotFoundException();}
		for (int index : map.keySet()){
			if(map.get(index).equals(name)){
				return index;
			}
		}
		return 0;
	}
	
	public int numberOfNodes() {
		return map.size();
	}
	
	

}
