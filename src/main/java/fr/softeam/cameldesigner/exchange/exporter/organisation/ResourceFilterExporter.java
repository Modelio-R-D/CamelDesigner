package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.ResourcePattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("20136894-5909-4d09-8984-ad6b93cb96cf")
public abstract class ResourceFilterExporter<T extends ResourceFilter> extends FeatureExporter<T> {
    @objid ("fae20345-6cbc-4c6d-a637-484bd2283c46")
    public ResourceFilterExporter(T elt) {
        super(elt);
    }

    @objid ("1fb00145-d1e9-44b4-93a3-eee048da3a38")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("19dd74c7-0d37-4cf8-9531-160ccc4b6c5b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.ResourceFilter) {
            setResourcePattern((camel.organisation.ResourceFilter) elt);
        }
    }

    @objid ("63448b13-1bf5-45b1-9ceb-68bcfc1d5278")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.OrganisationModel) && (elt instanceof camel.organisation.ResourceFilter)) {
            ((camel.organisation.OrganisationModel) context).getResourceFilters().add((camel.organisation.ResourceFilter) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("14b0dafa-81db-4799-8045-30e812990fd3")
    private void setResourcePattern(camel.organisation.ResourceFilter resFilter) {
        String content = this._element.getResourcePattern();
        if (content != null)
            resFilter.setResourcePattern(ResourcePattern.valueOf(content));
    }

}
