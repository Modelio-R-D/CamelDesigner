package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public abstract class AbstractGenerateProcess implements IElementProcess {
//private CamelModelService camelModelService = new CamelModelService ();
    private CDOObject camelElementParent;

    protected Map<ModelElement, CDOObject> processedUmlElements;

    public AbstractGenerateProcess(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        this.camelElementParent = camelElementParent;
        this.processedUmlElements = processedUmlElements;
    }

    @Override
    public Object process(Object element) {
        return process((ModelElement) element);
    }

    public CDOObject getCamelElementParent() {
        return this.camelElementParent;
    }

    public void setCamelElementParent(CDOObject camelElementParent) {
        this.camelElementParent = camelElementParent;
    }

    public CDOObject process(ModelElement element) {
        CDOObject processedElement = null;
        
        if(this.processedUmlElements.containsKey(element)) {
            processedElement = this.processedUmlElements.get(element);
            if(this.getCamelElementParent() != null) {
                this.updateParent(processedElement);
            }
        } else {
            processedElement = switchGenerate (element);
            if(processedElement != null) {
                this.processedUmlElements.put(element, processedElement);
            }
        }
        return processedElement;
    }

//    @objid ("f0be351a-4827-487a-8d8b-e4b8a9e106e0")
//    private Object generateCamelModel(Package packageElement) {
//        //CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
//        //camelModel.setName(packageElement.getName());
//        return this.camelElementParent;
//    }
    public Map<ModelElement, CDOObject> getProcessedUmlElements() {
        return this.processedUmlElements;
    }

    public void setProcessedUmlElements(Map<ModelElement, CDOObject> processedUmlElements) {
        this.processedUmlElements = processedUmlElements;
    }

    protected abstract void updateParent(CDOObject processedElement);

    /**
     * Generate Camel Element and update its container
     * @param ModelElement element from Modelio Model Tree
     * 
     * @return generated Camel Element
     */
    protected abstract CDOObject switchGenerate(ModelElement element);


//@objid ("cf7d67ce-cb76-459e-9c2e-b8858cd186b2")
//protected abstract void updateParent(CDOObject processedElement);
}
