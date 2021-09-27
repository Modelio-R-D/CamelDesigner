package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;

public abstract class AbstractGenerateProcess<T extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement, V extends CDOObject> implements IElementProcess<CDOObject, fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement> {
    //private CamelModelService camelModelService = new CamelModelService ();
    private V camelElementParent;

    protected Map<ModelElement, V> processedUmlElements;

    public AbstractGenerateProcess(V camelElementParent, Map<ModelElement, V> processedUmlElements) {
        this.camelElementParent = camelElementParent;
        this.processedUmlElements = processedUmlElements;
    }

    @Override
    public V process(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement element) {
//        if (element instanceof fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement)
//            return processing((T) element);
//        else {
//            return null;
//        }
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

    public V getCamelElementParent() {
        return this.camelElementParent;
    }

    public void setCamelElementParent(V camelElementParent) {
        this.camelElementParent = camelElementParent;
    }


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

    //    @objid ("f0be351a-4827-487a-8d8b-e4b8a9e106e0")
    //    private Object generateCamelModel(Package packageElement) {
    //        //CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
    //        //camelModel.setName(packageElement.getName());
    //        return this.camelElementParent;
    //    }
    public Map<ModelElement, V> getProcessedUmlElements() {
        return this.processedUmlElements;
    }

    public void setProcessedUmlElements(Map<ModelElement, V> processedUmlElements) {
        this.processedUmlElements = processedUmlElements;
    }

    protected abstract void updateParent(CDOObject processedElement);

    /**
     * Generate Camel Element and update its container (parent).
     * @param ModelElement element from Modelio Model Tree
     *
     * @return generated Camel Element
     */
    protected abstract V switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement element);


    //@objid ("cf7d67ce-cb76-459e-9c2e-b8858cd186b2")
    //protected abstract void updateParent(CDOObject processedElement);
}
