package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bb6f8a79-1a31-41ef-af63-4084289e5ce2")
public class ExternalIdentifierExporter<T extends ExternalIdentifier> extends FeatureExporter<T> {
    @objid ("72ac031f-c2c2-4338-8245-9d99f2d0f503")
    public ExternalIdentifierExporter(T elt) {
        super(elt);
    }

    @objid ("184d55d1-1186-4ee2-9df0-67987be5ce46")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createExternalIdentifier();
    }

    @objid ("2759cf14-0566-4abf-8161-05f2b9a3675c")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.ExternalIdentifier) {
            setIdentifier((camel.organisation.ExternalIdentifier) elt);
        }
    }

    @objid ("88523812-9212-42bd-b752-f76d78ebae8d")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if (elt instanceof camel.organisation.ExternalIdentifier) {
            camel.organisation.ExternalIdentifier extId = (camel.organisation.ExternalIdentifier) elt;
        
            if (context instanceof camel.organisation.OrganisationModel) {
                ((camel.organisation.OrganisationModel) context).getExternalIdentifiers().add(extId);
            }else    if (context instanceof camel.organisation.User) {
                ((camel.organisation.User) context).getExternalIdentifiers().add(extId);
            }else {
                super.attach(elt, context);
            }
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("f4e5982d-9732-43ac-a154-7e44012a1ac4")
    private void setIdentifier(camel.organisation.ExternalIdentifier id) {
        String content = this._element.getIdentifier();
        if (content != null)
            id.setIdentifier(content);
    }

}
