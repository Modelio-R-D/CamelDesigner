/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("02a06376-ba38-41b8-8de0-3342f7e49172")
    public static final String STEREOTYPE_NAME = "Cause";

    /**
     * Tells whether a {@link Cause proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Cause >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("04ad8ba6-c313-4d26-a7e3-ac0f1726920f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Cause.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Cause >> then instantiate a {@link Cause} proxy.
     * 
     * @return a {@link Cause} proxy on the created {@link Class}.
     */
    @objid ("96001df6-ffca-46b0-b6ec-8a2e0a583df1")
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
    @objid ("aa1cd808-acba-4e85-b4e7-7092dc3ca7cd")
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
    @objid ("da304f27-f52e-4e44-9117-45e4c95fb81d")
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
    @objid ("5209e05d-6967-477c-9d0b-df009b5d83a5")
    public void addEventInstances(final EventInstance obj) {
        if (obj!=null)
          ((Class) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("d0eb4b42-772b-4725-a8c6-f70af597f63b")
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
    @objid ("13e814eb-60c6-4c4f-99a7-b27ad13588c3")
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
    @objid ("f3b287b2-9416-4976-8b36-f8b6fdcb8a75")
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

    @objid ("71fab7ee-ec63-4f91-b65d-2cbdcc0a12e9")
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
    @objid ("ca95ea2d-dfb4-4e78-89db-9d5af0021056")
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

    @objid ("3df35180-a6e2-44e3-bc60-41e6541739c3")
    protected Cause(final Class elt) {
        super(elt);
    }

    @objid ("4715c654-3715-48a5-94ee-f2e266c99336")
    public static final class MdaTypes {
        @objid ("626970c1-a540-40fa-b44c-0148082654f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8b4782a-29be-424c-874d-5170ef9912da")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb0bddae-1ce9-47f2-8b75-1787ce8a8987")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7e39567-8961-4326-8752-ea1678f4aec6")
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
