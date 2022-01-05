package fr.softeam.cameldesigner.exchange.exporter.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("16c11825-ac31-46d3-a494-aafd126ad9a4")
public abstract class CredentialsExporter<T extends Credentials> extends FeatureExporter<T> {
    @objid ("7eefd4ae-bc56-4e84-9022-1bf391d73fd8")
    public CredentialsExporter(T elt) {
        super(elt);
    }

    @objid ("35b23599-744b-48ff-9a5e-ba9e33087c49")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("0e6aa852-735a-42e3-8c00-bf542725b982")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("17de17e5-a548-4551-b77c-93e45ea348ed")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
