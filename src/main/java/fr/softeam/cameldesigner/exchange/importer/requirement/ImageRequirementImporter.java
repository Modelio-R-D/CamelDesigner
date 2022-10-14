package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.location.Location;
import camel.requirement.ImageRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("a9dd87db-224f-4a3b-99a2-4a2eda22d5fd")
public class ImageRequirementImporter<T extends ImageRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement> extends HardRequirementImporter<T,V> {
    @objid ("27012bcb-d58a-4ff5-8a72-cb339b65089d")
    public ImageRequirementImporter() {
    }

    @objid ("08483494-984f-4af5-94a3-7f9b5b347fdd")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitImageRequirement(this);
    }

    @objid ("54aaf451-cf2a-4f14-99db-7b6717c512b8")
    public ImageRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("9b7b8752-c2cb-4aa4-a9a6-eb0a34b2aa8b")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.create();
    }

    @objid ("87d70b74-5924-4085-9175-c96eef9c85d6")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setImages(elt);
    }

    @objid ("c4802d4c-d7eb-4e63-8dfe-c51971ccb358")
    private void setImages(V elt) {
        // TODO Auto-generated method stub
        EList<String> value = this._element.getImages();
        if (value != null) {
            elt.setImages(value);
        }
    }

    @objid ("5fbb9577-9e13-4f73-b7f2-79e4591a7b0d")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel) {
            ((RequirementModel)context).addRequirements(elt);
        }
    }

}
