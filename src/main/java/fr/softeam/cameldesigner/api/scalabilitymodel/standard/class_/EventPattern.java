/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << EventPattern >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1376376d-c30d-492b-b270-8ae507dd5d21")
public abstract class EventPattern extends Event {
<<<<<<< HEAD
    @objid ("d9dac50c-1475-48cb-8acf-dc972dd8dc6d")
=======
    @objid ("24e9fdcf-9a4c-455e-876e-684779a8cc20")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "EventPattern";

    /**
     * Tells whether a {@link EventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << EventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("63434f3e-4535-40f4-99c2-857959f0dba0")
=======
    @objid ("66aae829-0a8f-44b3-ad71-d93a29c4b491")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventPattern.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("2a5fea40-41ba-4d89-8315-3b22f4d2386d")
=======
    @objid ("0cbeb6cf-3131-42a4-925b-30a90e9e1a32")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        EventPattern other = (EventPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("67c9c054-3065-4be0-98f2-231ac5e469be")
=======
    @objid ("a2ff7eef-0d87-416d-b0d2-9cc036dbcc6c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'timer' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("516acfe3-4b9b-4bc0-98ac-17b10f540ca1")
=======
    @objid ("92e21dda-49fa-4097-ac00-52e17f337eef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Timer getTimer() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(EventPattern.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(EventPattern.MdaTypes.MDAASSOCDEP_ROLE), "timer")){
                  if (Timer.canInstantiate(d.getDependsOn()))
                     return (Timer)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Timer.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("0e36854a-cc9c-4d72-9bf6-2db57133d89f")
=======
    @objid ("0a9df58b-2574-45b7-a28d-e80b0071e11f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'timer' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("62745a93-5549-460d-b677-fc207903261d")
=======
    @objid ("8e816a63-0fcb-4755-b5b7-3910c30fe5dd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setTimer(final Timer obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(EventPattern.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(EventPattern.MdaTypes.MDAASSOCDEP_ROLE), "timer")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), EventPattern.MdaTypes.MDAASSOCDEP);
              dep.setName("timer");      dep.putTagValue(EventPattern.MdaTypes.MDAASSOCDEP_ROLE, "timer");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("725068a1-ca4a-4cf3-b47b-bfecd407905a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("dae2e27c-c8af-4304-ad37-e6456850c211")
=======
    @objid ("9aaae2ed-a2ff-4a44-bf33-63918deb436f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected EventPattern(final Class elt) {
        super(elt);
    }

    @objid ("dd1011e3-255f-4c6a-a51e-162a33438d4c")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d68448a1-08c4-4e41-adc6-5f427bcc06f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eac554b1-e6d9-4a32-bcf3-75d00629ef33")
        private static Stereotype MDAASSOCDEP;

        @objid ("70b72602-6459-4ce1-af37-63753421a31c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9b9996c9-1044-444f-a9f6-fff63fb5acae")
=======
        @objid ("be5590db-2005-4c03-a933-1c504b57dc61")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("507c81ab-e671-43c7-8b9c-a4a3f56e9d77")
        private static Stereotype MDAASSOCDEP;

        @objid ("207d0a58-ece9-459f-936b-df4ad538b4f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4c68356-9168-4b9a-bd2f-883803bd4f19")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "46e221ca-8a8f-458b-8018-009a273cc009");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
