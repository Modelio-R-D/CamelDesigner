package fr.softeam.cameldesigner.elementmodel.walker.umlwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.generate.AbstractGenerateProcess;
import fr.softeam.cameldesigner.elementmodel.walker.IWalker;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c9176bd9-b9e7-47fb-862c-0c982a60e42c")
<<<<<<< HEAD
public class UmlWalker<T extends CamelElement> implements IWalker<CamelElement> {
    @objid ("4034c4c8-0191-4eba-9276-ec590aaea060")
    private AbstractGenerateProcess<CamelElement,CDOObject> generateProcess;

    @objid ("724aa8ad-221f-4624-b653-11344eebad5a")
    public UmlWalker(AbstractGenerateProcess<CamelElement,CDOObject> generateProcess) {
=======
public class UmlWalker implements IWalker<CamelElement> {
    @objid ("4034c4c8-0191-4eba-9276-ec590aaea060")
    private AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> generateProcess;

    @objid ("724aa8ad-221f-4624-b653-11344eebad5a")
    public UmlWalker(AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> generateProcess) {
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        this.generateProcess = generateProcess;
    }

    @objid ("3868778e-7a47-495c-b77f-bd2a0c1e0c02")
    @Override
    public void walk(CamelElement element) {
<<<<<<< HEAD
        //        CDOObject camelElement = this.generateProcess.process(element);
        //        if(camelElement != null) {
                if(element != null) {
                    for (CamelElement child : element.getChilds()) {
                        this.generateProcess.process(child, element);
        //                this.generateProcess.setCamelElementParent(camelElement);
                        walk(child);
                    }
                }
=======
        CDOObject camelElement = this.generateProcess.process(element);
        if(camelElement != null) {
            walkChildren(element, camelElement);
        }
    }

    @objid ("fe9fb9cd-42fa-4ecf-b0a2-4e533d0e549f")
    protected void walkChildren(CamelElement processedElement, CDOObject resultedElement) {
        for (CamelElement child : processedElement.getChilds()) {
            this.generateProcess.setCamelElementParent(resultedElement);
            walk(child);
        }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    }

}
