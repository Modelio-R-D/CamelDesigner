/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("c65ec36d-7a40-40a4-9695-9ea0a601b401")
    public static final String STEREOTYPE_NAME = "Cause";

    /**
     * Tells whether a {@link Cause proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Cause >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("83135a96-7141-45e0-9324-0a2292232c13")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Cause.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Cause >> then instantiate a {@link Cause} proxy.
     * 
     * @return a {@link Cause} proxy on the created {@link Class}.
     */
    @objid ("a6504a1f-99e4-4261-afb8-7bf2aa60cc1f")
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
    @objid ("77040916-9c5e-4ed9-b9b0-42e5c6dc5a5b")
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
    @objid ("421da321-bc3d-4ae3-9338-0467d26315b6")
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
    @objid ("5b2b459a-42ec-4154-8470-e9471952d297")
    public void addEventInstances(final EventInstance obj) {
        if (obj!=null)
          ((Class) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("16bb5161-512f-48b1-b7cb-59fe2857a636")
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
    @objid ("a7423336-0f03-42a6-b8f0-3863c9a28af8")
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
    @objid ("07af153d-bc47-4401-aec6-c9a21c36af76")
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

    @objid ("3118917d-e3f8-4111-89ba-b95d0adf8bc8")
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
    @objid ("e08915bb-e129-47dd-92e6-e51a6f54609f")
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

    @objid ("2e6a54b7-8372-4b47-9208-d87784bd7524")
    protected Cause(final Class elt) {
        super(elt);
    }

    @objid ("4715c654-3715-48a5-94ee-f2e266c99336")
    public static final class MdaTypes {
        @objid ("f2c83f3f-1ac7-48cc-983e-281817812b9e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97c5f078-2cb3-4ad5-8f97-b7ba7a4c0f83")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f44f088-abe6-42ad-9ef1-a28438a339c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a90c505-25b1-4187-92aa-da5cd0c32ded")
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
