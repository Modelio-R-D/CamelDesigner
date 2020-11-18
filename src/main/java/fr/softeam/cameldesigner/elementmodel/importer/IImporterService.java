package fr.softeam.cameldesigner.elementmodel.importer;

import org.modelio.metamodel.uml.statik.Package;

public interface IImporterService {
    void importModelFromFile(Package packageOwner, String filePath);

}
