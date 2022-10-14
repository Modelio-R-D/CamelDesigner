package fr.softeam.cameldesigner.exchange.importer.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import camel.deployment.LocationCoupling;
import camel.deployment.LocationCouplingType;
import camel.deployment.SoftwareComponent;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("d8d8c87e-09f4-4575-bfda-f92f94ba9a57")
public class LocationCouplingImporter<T extends LocationCoupling, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling> extends ComponentRelationImporter<T,V> {
    @objid ("1026e1b0-57ae-4cd3-9abb-49254c04c9dc")
    public LocationCouplingImporter() {
        super();
    }

    @objid ("056b63c0-b586-4770-8a3f-925b13ca1177")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling.create();
    }

    @objid ("6aeb748c-f40c-4f69-be78-da6695375790")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addLocationCouplings(elt);
        else
            super.attach(elt, context);
    }

    @objid ("4df1d0e3-6615-4ce2-8c2f-d8a2691aeb77")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitLocationCoupling(this);
    }

    @objid ("e47fbba3-40c9-41fd-89dc-3e58cfd872e4")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setCouplingType(elt);
        setRelaxed(elt);
        setSoftwareComponent(elt);
    }

    @objid ("5f2c7ab8-dbb7-41c8-a752-2cc2f10d2013")
    private void setCouplingType(V elt) {
        LocationCouplingType value = this._element.getCouplingType();
        if (value != null) {
            elt.setCouplingType(value.getLiteral());;
        }
    }

    @objid ("31558264-6d27-4990-b4ae-42845f584909")
    private void setRelaxed(V elt) {
        Boolean value = this._element.isRelaxed();
        if (value != null) {
            elt.setRelaxed(value);
        }
    }

    @objid ("f5ed8b3a-0c5e-490e-b199-9dd84381925c")
    private void setSoftwareComponent(V elt) {
        EList<SoftwareComponent> sof = this._element.getSoftwareComponents();

        if (sof != null) {
            for(SoftwareComponent obj : sof) {
                if (obj != null) {
                    CamelElement valueElt = this._process.getElement(obj);
                    if (valueElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent) {
                        elt.addSoftwareComponents((fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent) valueElt);
                    }
                }
            }
        }
    }

}
