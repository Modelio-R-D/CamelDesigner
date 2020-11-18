package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

public class CreateMetricModelCommand extends CreateCamelSubModelCommand {
    public CreateMetricModelCommand() {
        super("Metric Model", MetricTypeModel.STEREOTYPE_NAME, "Metric Type Model Diagram", MetricModelDiagram.STEREOTYPE_NAME);
    }

}
