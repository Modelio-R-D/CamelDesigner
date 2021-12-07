package fr.softeam.cameldesigner.impl;

import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.event.IModelChangeEvent;
import org.modelio.api.modelio.model.event.IModelChangeHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8741f612-62c3-4ff3-b18d-eaba6db57062")
public class CamelModelChangeHandler implements IModelChangeHandler {
    @objid ("c33801fa-b1e7-45bf-a46f-7f7541969870")
    private static TagsManager tagsManager = new TagsManager();

    @objid ("b0cedb71-18bf-455d-a689-f0d6c99d7cbf")
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

    @objid ("0a93c1c8-b41b-4d04-a03d-b27aa69f5d3f")
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
