package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.core.NamedElement;
import camel.mms.MmsObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Port;

public abstract class AbstractReverseProcess implements IElementProcess {
    protected ModelElement umlElementParent;

    protected Map<CDOObject, CamelElement> processedCamelElements;

    public AbstractReverseProcess(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        this.umlElementParent = umlElementParent;
        this.processedCamelElements = processedCamelElements;
    }

    public ModelElement getUmlElementParent() {
        return this.umlElementParent;
    }

    public void setUmlElementParent(ModelElement umlElementParent) {
        this.umlElementParent = umlElementParent;
    }

    public Map<CDOObject, CamelElement> getProcessedCamelElements() {
        return this.processedCamelElements;
    }

    public void setProcessedCamelElements(Map<CDOObject, CamelElement> processedCamelElements) {
        this.processedCamelElements = processedCamelElements;
    }

    @Override
    public CamelElement process(Object element) {
        return process ((CDOObject) element);
    }

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
                
                this.updateOwner(processedElement.getElement(), element);
        return processedElement;
    }

    protected abstract CamelElement switchReverse(CDOObject element);

}
