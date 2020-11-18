package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsObject;
import camel.mms.MmsProperty;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

public class MetaDataWalker extends AbstractCamelWalker {
    public MetaDataWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

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
