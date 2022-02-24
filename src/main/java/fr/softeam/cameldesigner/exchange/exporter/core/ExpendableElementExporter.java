package fr.softeam.cameldesigner.exchange.exporter.core;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import org.eclipse.emf.cdo.CDOObject;

@objid ("beef12f9-e35c-4247-9cd8-a2eef0e9a0d3")
public abstract class ExpendableElementExporter<T extends ExpendableElement> extends NamedElementExporter<T> {
    @objid ("8ded92a2-0032-4df4-a7d5-2a981dbb32fb")
    public ExpendableElementExporter(T elt) {
        super(elt);
    }

    @objid ("01234142-2404-4fd2-98d2-fa6bdebd466f")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("8d2d2f18-a9f2-490b-8445-a03c3bf08856")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.core.NamedElement) {
            setAnnotations((camel.core.NamedElement) elt);
        }
    }

    @objid ("7d6e0d5c-6ed7-4722-b3e0-e364b46f84e6")
    private void setAnnotations(camel.core.NamedElement elt) {
        List<camel.mms.MmsObject> annotations = new ArrayList<>();
        for (MmsObject annotation : this._element.getAnnotations()) {
            CDOObject camelAnnotation = this._process.getElement(annotation);
            if ((camelAnnotation != null) &&  (camelAnnotation instanceof camel.mms.MmsObject))
                annotations.add((camel.mms.MmsObject)camelAnnotation);
        }
        
        elt.getAnnotations().addAll(annotations);
    }

    @objid ("10028ab6-51f1-4a5e-83aa-0b959bdb95c9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
