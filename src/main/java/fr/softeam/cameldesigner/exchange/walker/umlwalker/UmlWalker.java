package fr.softeam.cameldesigner.exchange.walker.umlwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.exporter.GenerateProcess;
import fr.softeam.cameldesigner.exchange.walker.IWalker;

@objid ("c9176bd9-b9e7-47fb-862c-0c982a60e42c")
public class UmlWalker implements IWalker<CamelElement> {
    @objid ("4034c4c8-0191-4eba-9276-ec590aaea060")
    private GenerateProcess generateProcess;

    @objid ("724aa8ad-221f-4624-b653-11344eebad5a")
    public UmlWalker(GenerateProcess generateProcess) {
        this.generateProcess = generateProcess;
    }

    @objid ("3868778e-7a47-495c-b77f-bd2a0c1e0c02")
    @Override
    public void walk(CamelElement element) {
        if(element != null) {
            for (CamelElement child : element.getChilds()) {
                this.generateProcess.process(child, element);
                walk(child);
            }
        }
    }

}
