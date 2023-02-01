/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Cause >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1cafb6a7-d466-4de2-a97f-7137b1fa5b8b")
public class Cause extends FeatureClass {
<<<<<<< HEAD
    @objid ("f40c4a3a-b58a-4827-886d-fc090bcc94f3")
=======
    @objid ("20f8cb6b-35fc-4b7c-9566-cfa822be2f46")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Cause";

    /**
     * Tells whether a {@link Cause proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Cause >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("09723cd2-7189-45bd-a772-51c8d3d9b789")
=======
    @objid ("393ef695-78b4-4a53-a93b-d921ad1be6da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Cause.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Cause >> then instantiate a {@link Cause} proxy.
     * 
     * @return a {@link Cause} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("3b3636e8-b56b-4dac-b598-2e6e7095e950")
=======
    @objid ("1b513523-adcd-4300-8860-16c622724e44")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Cause create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Cause.STEREOTYPE_NAME);
        return Cause.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Cause} proxy from a {@link Class} stereotyped << Cause >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Cause} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("6163f122-acc5-45a8-a316-dafd7cdab24f")
=======
    @objid ("177d8144-dba4-4e61-a29a-66aff5952602")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Cause instantiate(final Class obj) {
        return Cause.canInstantiate(obj) ? new Cause(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Cause} proxy from a {@link Class} stereotyped << Cause >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Cause} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("aeb90472-aa09-484e-a104-48671a9b0903")
=======
    @objid ("67f71dd7-40a5-471c-bb2d-2b9f767cb867")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Cause safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Cause.canInstantiate(obj))
        	return new Cause(obj);
        else
        	throw new IllegalArgumentException("Cause: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ee1c3703-fcd2-410c-9668-57cb361c6bf5")
=======
    @objid ("57d9a911-1c1a-42d8-82fb-8dd371a91c1e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addEventInstances(final EventInstance obj) {
        if (obj!=null)
          ((Class) this.elt).getDeclared().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("917b2683-7cc1-48e8-b8d7-366ba56bb513")
=======
    @objid ("6a6a5be1-82a2-4de3-aa43-7a41846cfa0f")
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
        Cause other = (Cause) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("1287c83c-72ac-4408-8f03-4b1b0cc942cf")
=======
    @objid ("4bdc676f-e020-49bd-a56b-23a188b51da9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("63b4ea19-3808-4b92-8fb8-74103ebc6b3f")
=======
    @objid ("475a50be-567a-4b00-b45d-e504dd40d615")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<EventInstance> getEventInstances() {
        List<EventInstance> results = new ArrayList<>();
        for (Instance mObj : ((Class) this.elt).getDeclared()){
        	if (FunctionalEventInstance.canInstantiate(mObj))
        			results.add((FunctionalEventInstance)CamelDesignerProxyFactory.instantiate(mObj, FunctionalEventInstance.STEREOTYPE_NAME));
        	if (NonFunctionalEventInstance.canInstantiate(mObj))
        			results.add((NonFunctionalEventInstance)CamelDesignerProxyFactory.instantiate(mObj, NonFunctionalEventInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("62f9a128-d91f-4077-9a0b-111a09e3bddf")
=======
    @objid ("7da56988-e5a2-456f-97f6-927172784a14")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a3c8c3fa-2b09-4863-ad49-3e8c7e5e6863")
=======
    @objid ("0347570b-4831-4656-8f2a-ccadf4f48f3e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeEventInstances(final EventInstance obj) {
        return (obj!=null)? ((Class) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    @objid ("77e66320-04fc-43a7-bde1-ab08319b2626")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("3ac15908-d5b4-42fe-bfb2-d5e2616dcd19")
=======
    @objid ("86b610de-5243-41ea-9fdb-91677f809ee0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Cause(final Class elt) {
        super(elt);
    }

    @objid ("4715c654-3715-48a5-94ee-f2e266c99336")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("9c8b86b6-e31d-4a49-bc22-d2aa479e7ba4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("210da31a-2d7d-46d8-9e0a-64064bc0d29e")
        private static Stereotype MDAASSOCDEP;

        @objid ("416dae09-d23b-4480-bb6a-02fd46544a57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6d87a09-ba64-479c-8fa4-f54ba16f6cd0")
=======
        @objid ("424ca878-1e3f-464c-9f6a-dfd6d3adcdf1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("00dc4fb6-4d7a-42ff-b027-c9d82dfb9f06")
        private static Stereotype MDAASSOCDEP;

        @objid ("7b18214f-9cb1-4cc4-a756-3e97df5dc4ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5bd372f6-cadb-496b-9fdb-e7695196fab8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc44bcb6-59df-49ef-9ed6-13f1d2b85393");
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
