package fr.softeam.cameldesigner.exchange.importer;


import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;


public interface IImporter<T extends CDOObject, V extends CamelElement, W extends CamelElement> {

    CamelElement createCamelElt(T owner);


    void setProperties(V elt);


    void attach(V elt, W context);



}
