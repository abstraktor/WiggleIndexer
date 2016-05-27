package relations;

import org.neo4j.graphdb.Label;

/**
 * Created by reflektor on 27/05/16.
 */
public class DynamicLabel implements Label {
	private final String label;

	public DynamicLabel(final String label) {
		this.label = label;
	}

	public String name(){
		return label;
	}
}
