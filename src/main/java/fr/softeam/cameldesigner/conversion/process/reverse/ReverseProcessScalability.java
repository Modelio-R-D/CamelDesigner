package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;

@objid ("f0ade7df-406f-4576-94e0-6d2e46019c68")
public class ReverseProcessScalability extends AbstractReverseProcess {
    @objid ("34abfcc5-9ac6-4a3f-b1ec-d2aa7b32db8a")
    public ReverseProcessScalability(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("e3d5bdf9-8f05-43a5-83ab-7f91f4c1ee7d")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
