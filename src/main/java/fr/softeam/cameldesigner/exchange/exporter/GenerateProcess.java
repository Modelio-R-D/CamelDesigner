package fr.softeam.cameldesigner.exchange.exporter;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;
import fr.softeam.cameldesigner.exchange.exporter.core.CamelElementExporter;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

@objid ("9d3c43e8-d77f-4de9-89be-8e5ed21b089a")
public class GenerateProcess implements IElementProcess<CDOObject,CamelElement> {
    @objid ("c38ecb82-ebdb-4e95-8828-9fddc1cc8acf")
    private CamelElement camelElementParent;

    @objid ("cdf8cf56-51a4-4ae9-a194-1fa866a4bbfc")
    public GenerateProcess(CamelElement camelElementParent) {
        this.camelElementParent = camelElementParent;
    }

    @objid ("a94a6675-9c20-42e9-9c47-ad24f1719e24")
    @Override
    public CDOObject process(CamelElement element, CamelElement context) {
        CDOObject processedElement = null;
        GenerateMap genMap = GenerateMap.getInstance();

        try {
            CamelElementExporter<CamelElement> exporter = (CamelElementExporter) ExporterFactory.instantiateExporter(element.getElement());
            exporter.setProcess(this);

            if(genMap.containsKey(element)) {
                processedElement = genMap.get(element);
            } else {
                CDOObject owner = getElement(context);
                processedElement = exporter.createCamelElt(owner);
                exporter.attach(processedElement, owner);
                if(processedElement != null) {
                    genMap.put(element, processedElement);
                }
            }
            exporter.setProperties(processedElement);

        }catch (Exception e) {
            CamelDesignerModule.logService.error(e);
            return null;
        }
        return processedElement;
    }

    @objid ("be18a51b-552b-43d8-9e4a-73be50508abd")
    public CamelElement getCamelElementParent() {
        return this.camelElementParent;
    }

    @objid ("9cc5713c-6868-4f77-9d4d-3a98942c3ab1")
    public void setCamelElementParent(CamelElement camelElementParent) {
        this.camelElementParent = camelElementParent;
    }

    @objid ("df632725-e74c-469b-a67d-08864b9aaec8")
    public CDOObject getElement(CamelElement element) {
        GenerateMap genMap = GenerateMap.getInstance();
        if(genMap.containsKey(element)) {
            return genMap.get(element);
        }else {
            return process(element, (CamelElement) CamelDesignerProxyFactory.instantiate((ModelElement) element.getElement().getCompositionOwner()));
        }
    }

}
