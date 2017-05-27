package graph;

public class Node {
	
	private final Integer id;
    private final String word;
    
    public Node(int id, String word) {
    	this.id = id;
    	this.word = word;
    }
    
    public Integer getId() {
        return id;
    }

    public String getWord() {
        return word;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (word == null) {
            if (other.word != null)
                return false;
        } else if (!word.equals(other.getWord()))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return word;
    }

}
