package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsObject;
import camel.mms.MmsProperty;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("fcd5c3cd-5ab9-4895-84d5-e42c5472edcb")
public class MetaDataWalker extends AbstractCamelWalker {
    @objid ("5de01d19-8191-4ef6-bdd0-3b7f783bf1f1")
    public MetaDataWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("d3653cc1-c3f8-486e-8ee4-cf8190499ecd")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        if(processedElement instanceof MetaDataModel) {
        
            MetaDataModel metaDataModel = (MetaDataModel) processedElement;
            for (MmsObject mmsObject : metaDataModel.getMetadataElements()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(mmsObject);
            }
        } else if (processedElement instanceof MmsConcept) {
            //this.reverseProcess.setUmlElementParent(resultedElement.getElement());
            
            MmsConcept mmsConcept = (MmsConcept) processedElement;
        
            for (MmsProperty mmsProperty : mmsConcept.getProperty()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(mmsProperty);
            }
            
            for (MmsConcept mmsConceptChild : mmsConcept.getConcept()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(mmsConceptChild);
            }
        //            for (MmsConceptInstance mmsConceptInstance : mmsConcept.getInstance()) {
        //                walk(mmsConceptInstance);
        //            }
        }
    }

}
