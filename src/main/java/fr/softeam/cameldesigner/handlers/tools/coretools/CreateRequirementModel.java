package fr.softeam.cameldesigner.handlers.tools.coretools;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;

public class CreateRequirementModel extends CreateSubModelTool {
    public CreateRequirementModel() {
        super("RequirementModel", RequirementModel.STEREOTYPE_NAME, "RequirementModelDiagram", RequirementModelDiagram.STEREOTYPE_NAME);
    }

}
