package fr.softeam.cameldesigner.conversion.process.generate;

<<<<<<< HEAD
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;
import fr.softeam.cameldesigner.exchange.exporter.ExporterFactory;
import fr.softeam.cameldesigner.exchange.exporter.GenerateMap;
import fr.softeam.cameldesigner.exchange.exporter.core.CamelElementExporter;
=======
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("9d3c43e8-d77f-4de9-89be-8e5ed21b089a")
<<<<<<< HEAD
public abstract class AbstractGenerateProcess<T extends CamelElement, V extends CDOObject> implements IElementProcess<CDOObject,CamelElement> {
    @objid ("4ec5fbef-5953-4306-b5ba-a23b2b8953d8")
    private V camelElementParent;

//    @objid ("e22a2812-63d1-4d37-a8d3-fdf745a38240")
//    protected Map<CamelElement, CDOObject> processedUmlElements;
    @objid ("cdf8cf56-51a4-4ae9-a194-1fa866a4bbfc")
    public AbstractGenerateProcess(V camelElementParent) {
=======
public abstract class AbstractGenerateProcess<T extends CamelElement, V extends CDOObject> implements IElementProcess<CDOObject,fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement> {
//private CamelModelService camelModelService = new CamelModelService ();
    @objid ("4ec5fbef-5953-4306-b5ba-a23b2b8953d8")
    private V camelElementParent;

    @objid ("e22a2812-63d1-4d37-a8d3-fdf745a38240")
    protected Map<ModelElement, V> processedUmlElements;

    @objid ("cdf8cf56-51a4-4ae9-a194-1fa866a4bbfc")
    public AbstractGenerateProcess(V camelElementParent, Map<ModelElement, V> processedUmlElements) {
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        this.camelElementParent = camelElementParent;
        //        this.processedUmlElements = processedUmlElements;
    }

    @objid ("a94a6675-9c20-42e9-9c47-ad24f1719e24")
    @Override
<<<<<<< HEAD
    public CDOObject process(CamelElement element, CamelElement context) {
        CDOObject processedElement = null;
        GenerateMap genMap = GenerateMap.getInstance();
        
        try {
            CamelElementExporter exporter = (CamelElementExporter)ExporterFactory.instantiateExporter(element.getElement());
            exporter.setProcess(this);
        
            if(genMap.containsKey(element)) {
                processedElement = genMap.get(element);
                if(this.getCamelElementParent() != null) {
                    this.updateParent(processedElement);
                }
            } else {
                //            processedElement = switchGenerate(element);
                CDOObject owner = getElement(context);
                processedElement = exporter.createCamelElt(owner);
                exporter.attach(processedElement, owner);
                if(processedElement != null) {
                    genMap.put(element, processedElement);
                }
=======
    public V process(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement element) {
        V processedElement = null;
        
        if(this.processedUmlElements.containsKey(element.getElement())) {
            processedElement = this.processedUmlElements.get(element.getElement());
            if(this.getCamelElementParent() != null) {
                this.updateParent(processedElement);
            }
        } else {
            processedElement = switchGenerate(element);
            if(processedElement != null) {
                this.processedUmlElements.put(element.getElement(), processedElement);
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
            }
            exporter.setProperties(processedElement);
        
        }catch (Exception e) {
            return null;
        }
        return processedElement;
    }

    @objid ("be18a51b-552b-43d8-9e4a-73be50508abd")
    public V getCamelElementParent() {
        return this.camelElementParent;
    }

    @objid ("9cc5713c-6868-4f77-9d4d-3a98942c3ab1")
    public void setCamelElementParent(V camelElementParent) {
        this.camelElementParent = camelElementParent;
    }

<<<<<<< HEAD
//    @objid ("5da7e840-a9e2-4a03-8e59-2aafc9a38c12")
//    public Map<CamelElement, CDOObject> getProcessedUmlElements() {
//        return this.processedUmlElements;
//    }
//
//    @objid ("7d411501-7672-41d8-b24a-8654344cd1bb")
//    public void setProcessedUmlElements(Map<CamelElement, CDOObject> processedUmlElements) {
//        this.processedUmlElements = processedUmlElements;
//    }
    @objid ("0c508a4c-cf80-4309-8754-958351fdb46e")
    protected abstract void updateParent(CDOObject processedElement);

    /**
     * Generate Camel Element and update its container (parent).
     * @param ModelElement element from Modelio Model Tree
     * 
     * @return generated Camel Element
     */
    @objid ("ff67385b-127c-4009-b878-ccfbd6709cd5")
    protected abstract V switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement element);

    @objid ("3be379d9-d774-4dab-9f71-7130c6d3df2d")
    private CDOObject processing(T element) {
        CDOObject processedElement = null;
        GenerateMap genMap = GenerateMap.getInstance();
        
        if(genMap.containsKey(element)) {
            processedElement = genMap.get(element);
            if(this.getCamelElementParent() != null) {
                this.updateParent(processedElement);
            }
        } else {
            processedElement = switchGenerate(element);
            if(processedElement != null) {
                genMap.put(element, processedElement);
            }
        }
        return processedElement;
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

=======
    @objid ("5da7e840-a9e2-4a03-8e59-2aafc9a38c12")
    public Map<ModelElement, V> getProcessedUmlElements() {
        return this.processedUmlElements;
    }

    @objid ("7d411501-7672-41d8-b24a-8654344cd1bb")
    public void setProcessedUmlElements(Map<ModelElement, V> processedUmlElements) {
        this.processedUmlElements = processedUmlElements;
    }

    @objid ("0c508a4c-cf80-4309-8754-958351fdb46e")
    protected abstract void updateParent(CDOObject processedElement);

    /**
     * Generate Camel Element and update its container (parent).
     * @param ModelElement element from Modelio Model Tree
     * 
     * @return generated Camel Element
     */
    @objid ("ff67385b-127c-4009-b878-ccfbd6709cd5")
    protected abstract V switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement element);

    @objid ("3be379d9-d774-4dab-9f71-7130c6d3df2d")
    private V processing(T element) {
        V processedElement = null;
        
        if(this.processedUmlElements.containsKey(element.getElement())) {
            processedElement = this.processedUmlElements.get(element.getElement());
            if(this.getCamelElementParent() != null) {
                this.updateParent(processedElement);
            }
        } else {
            processedElement = switchGenerate(element);
            if(processedElement != null) {
                this.processedUmlElements.put(element.getElement(), processedElement);
            }
        }
        return processedElement;
    }

>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
}
