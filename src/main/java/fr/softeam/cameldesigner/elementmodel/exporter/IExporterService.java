package fr.softeam.cameldesigner.elementmodel.exporter;

import org.modelio.metamodel.uml.statik.Package;

public interface IExporterService {
    void exportCamelUMLModel(Package camelUMLModel, String directoryOutputPath);

}
