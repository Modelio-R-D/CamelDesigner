package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.core.NamedElement;
import camel.mms.MmsObject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Port;

@objid ("8252e63d-68de-4dd8-8beb-0144ac974cd4")
public abstract class AbstractReverseProcess implements IElementProcess {
    @objid ("ba71fc6d-7f0c-4684-935c-9ff24767bc12")
    protected Map<CDOObject, CamelElement> processedCamelElements;

    @objid ("80dc889f-6be4-4759-9b9b-0ab9de0cd75b")
    protected ModelElement umlElementParent;

    @objid ("782dad31-8c48-40ff-9f85-f31298fa11ca")
    public AbstractReverseProcess(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        this.umlElementParent = umlElementParent;
        this.processedCamelElements = processedCamelElements;
    }

    @objid ("166a14f5-fbef-4804-8904-454eaafcad9a")
    public ModelElement getUmlElementParent() {
        return this.umlElementParent;
    }

    @objid ("a1e94a39-0916-4ba0-be4e-682a48881898")
    public void setUmlElementParent(ModelElement umlElementParent) {
        this.umlElementParent = umlElementParent;
    }

    @objid ("f12ba9a5-2ec1-4922-ab0a-9f7bf6f47590")
    public Map<CDOObject, CamelElement> getProcessedCamelElements() {
        return this.processedCamelElements;
    }

    @objid ("b277d0c0-ecb1-411a-86a8-733cb06a97a2")
    public void setProcessedCamelElements(Map<CDOObject, CamelElement> processedCamelElements) {
        this.processedCamelElements = processedCamelElements;
    }

    @objid ("c316b5d0-3bb1-46c7-aa3a-12227085b1a2")
    @Override
    public CamelElement process(Object element, fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement context) {
        return process ((CDOObject) element);
    }

    @objid ("f8aeb402-7d12-4730-ba5f-0316f4862ae3")
    protected void updateOwner(ModelElement reversedElement, CDOObject element) {
        if (this.umlElementParent != null) {
            if(reversedElement instanceof ModelTree) {
                ((ModelTree) reversedElement).setOwner((ModelTree) this.umlElementParent);
            } else if (reversedElement instanceof Attribute) {
                ((Attribute)reversedElement).setOwner((Classifier) this.umlElementParent);
            } else if (reversedElement instanceof Port) {
                ((Port)reversedElement).setOwner((Classifier) this.umlElementParent);
            }
        }
    }

    @objid ("124a736b-6e07-4a67-9ed8-e07c8eaf2459")
    public CamelElement process(CDOObject element) {
        //        java.util.Map<EObject,java.util.Collection<Setting>> map = EcoreUtil.ExternalCrossReferencer.find(element);
        //                if(! map.isEmpty()) {
        //                    StringBuilder sb = new StringBuilder();
        //                    Iterator<Entry<EObject, java.util.Collection<Setting>>> iter = map.entrySet().iterator();
        //                    while (iter.hasNext()) {
        //                        Entry<EObject, java.util.Collection<Setting>> entry = iter.next();
        //                        sb.append(entry.getKey());
        //                        sb.append('=').append('"');
        //                        sb.append(entry.getValue());
        //                        sb.append('"');
        //                        if (iter.hasNext()) {
        //                            sb.append(',').append(' ');
        //                        }
        //                    }
        //                    System.out.println(sb.toString());
        //                }
        //        System.out.println(map);
        
        CamelElement processedElement = null;
        if(this.processedCamelElements.containsKey(element)) {
            processedElement = this.processedCamelElements.get(element);
        } else {
            processedElement = this.switchReverse (element);
        
            /*
             *  update name and add annotations
             */
            if(processedElement != null) {
        
                if(element instanceof NamedElement) {
                    NamedElement namedElement = (NamedElement)element;
                    processedElement.getElement().setName(((NamedElement)element).getName());
        
                    EList<MmsObject> annotations = namedElement.getAnnotations();
        
        
                } else if (element instanceof MmsObject) {
                    processedElement.getElement().setName(((MmsObject)element).getName());
        
        
        
                }
                this.processedCamelElements.put(element, processedElement);
            }
        
        }
        if(processedElement != null) {
            this.updateOwner(processedElement.getElement(), element);
        }
        return processedElement;
    }

    /**
     * switchReverse will only reverse the element (and its dependencies) without updating the parent. Updating the parent will happen in method process
     * @return
     */
    @objid ("4efa9230-28fd-4774-8069-d1a47ebb24e4")
    protected abstract CamelElement switchReverse(CDOObject element);

}
