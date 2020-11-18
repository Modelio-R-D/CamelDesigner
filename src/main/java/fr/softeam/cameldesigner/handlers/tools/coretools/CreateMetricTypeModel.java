package fr.softeam.cameldesigner.handlers.tools.coretools;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;

public class CreateMetricTypeModel extends CreateSubModelTool {
    public CreateMetricTypeModel() {
        super("MetricTypeModel", MetricTypeModel.STEREOTYPE_NAME, "MetricTypeModelDiagram", MetricModelDiagram.STEREOTYPE_NAME);
    }

}
