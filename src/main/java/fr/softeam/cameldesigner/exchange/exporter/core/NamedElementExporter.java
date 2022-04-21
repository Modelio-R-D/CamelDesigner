package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c2a96761-9403-4b2e-a6d6-e50ed8db9c57")
public abstract class NamedElementExporter<T extends NamedElement> extends CamelElementExporter<T> {
    @objid ("ccdacba4-6158-4a74-99f2-b02829d7007b")
    public NamedElementExporter(T elt) {
        super(elt);
    }

    @objid ("6b38c7c9-9c62-4608-848a-e090b79d04cc")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("2f0cb611-164a-4b69-9473-c4adfc67deea")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.core.NamedElement) {
            camel.core.NamedElement namedElt = (camel.core.NamedElement) elt;
            setName(namedElt);
            setDescription(namedElt);
        }
        else if (elt instanceof camel.mms.MmsObject) {
            camel.mms.MmsObject namedElt = (camel.mms.MmsObject) elt;
            setName(namedElt);
            setDescription(namedElt);
        }
    }

    @objid ("3985a6ea-ddc1-4e51-9e0e-fcfeb1dd43e9")
    private void setName(camel.core.NamedElement elt) {
        elt.setName(this._element.getName());
    }

    @objid ("5bfee16c-5dc4-47fe-8003-f455e306babb")
    private void setDescription(camel.core.NamedElement elt) {
        String content = this._element.getDescription();
        if ((content != null) && (!(content.equals("")))){
            elt.setDescription(content);
        }
    }

    @objid ("aaf30836-c352-43b1-820b-e99993b1686a")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("4e056703-1f68-400d-934f-325e897179b4")
    private void setName(camel.mms.MmsObject elt) {
        elt.setName(this._element.getName());
    }

    @objid ("ca186abd-7a22-4139-b07f-9b06648987d3")
    private void setDescription(camel.mms.MmsObject elt) {
        String content = this._element.getDescription();
        if ((content != null) && (!(content.equals("")))){
            elt.setDescription(content);
        }
    }

}
