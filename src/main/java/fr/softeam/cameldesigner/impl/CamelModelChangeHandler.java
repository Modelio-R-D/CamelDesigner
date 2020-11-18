package fr.softeam.cameldesigner.impl;

import java.util.Set;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.event.IModelChangeEvent;
import org.modelio.api.modelio.model.event.IModelChangeHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CamelModelChangeHandler implements IModelChangeHandler {
    private static TagsManager tagsManager = new TagsManager();

    @Override
    public void handleModelChange(IModelingSession session, IModelChangeEvent event) {
        /*
         * handle Created elements
         */
        Set<MObject> createdEvents = event.getCreationEvents();
        for ( MObject createdEvent : createdEvents){
            handleCreatedElement(session, createdEvent);
        }
        
        
        /*
         * Handle Updated elements
         */
        //        Set<MObject> updatedEvents = event.getUpdateEvents();
        //        for ( MObject updatedEvent : updatedEvents){
        //            handleUpdatedElement(session, updatedEvent);
        //        }
        
        
        /*
         * Handle Deleted Elements
         */
        //        List<IElementDeletedEvent> deleteEvents = event.getDeleteEvents();
        //        for (IElementDeletedEvent deleteEvent : deleteEvents){
        //            handleDeletedElement(session, deleteEvent);
        //        }
        
        
        
        /*
         * Handle Moved elements
         */
        //        List<IElementMovedEvent> movedEvents = event.getMoveEvents();
        //        for(IElementMovedEvent movedEvent:movedEvents) {
        //            handleMovedElement(session, movedEvent);
        //        }
    }

    private static void handleCreatedElement(IModelingSession session, MObject createdEvent) {
        // If Created Class
        //        if (createdEvent instanceof Class) {
        //            try( ITransaction transaction = session.createTransaction ("Create NamedElement tag Name")){
        //
        //                Class createdClass = (Class) createdEvent;
        //                if(createdClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.NAMED_ELEMENT)) {
        //
        //                    tagsManager.createTag(createdClass, "Name", createdClass.getName());
        //
        //                }
        //                transaction.commit();
        //            }
        //        }
    }

}
