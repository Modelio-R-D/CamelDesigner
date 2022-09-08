package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.ModelResourceFilter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b9c729d8-6914-4f52-a979-5c9f74be88d6")
public class ModelResourceFilterImporter<T extends ModelResourceFilter, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter> extends ResourceFilterImporter<T,V> {
    @objid ("22404a8b-bcf2-4193-ba9d-6864c45845a8")
    public ModelResourceFilterImporter() {
    }

    @objid ("cabcda79-8590-4d12-b256-1196703dd3b3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitModelResourceFilter(this);
    }

    @objid ("d7077c88-7efa-4029-b9e7-2c2a7c5dbb1c")
    public ModelResourceFilterImporter(T elt) {
        super(elt);
    }

    @objid ("033e357c-2e7a-4a75-b5d1-6c86c96915ca")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.create();
    }

    @objid ("bf27a469-53e9-4e68-ac50-c97a51bbda86")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
