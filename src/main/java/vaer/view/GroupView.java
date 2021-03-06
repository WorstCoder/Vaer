package vaer.view;

import vaer.model.Group;

public interface GroupView {
	
	GroupView group(String groupName);
	
	VariableView variable(String variableName);
	
	<T> void removeChild(NodeView<T> child);
	
	void setGroup(Group group);
}
