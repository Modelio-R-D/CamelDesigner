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
    @objid ("bc1a5948-19bf-4bf8-b264-ac48cacd0b82")
    public static final String STEREOTYPE_NAME = "Cause";

    /**
     * Tells whether a {@link Cause proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Cause >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("776d1e64-5e98-4f67-875c-23d5938d59fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Cause.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Cause >> then instantiate a {@link Cause} proxy.
     * 
     * @return a {@link Cause} proxy on the created {@link Class}.
     */
    @objid ("ea84b958-db64-439a-8bab-a99ba57d0c06")
    public static Cause create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Cause.STEREOTYPE_NAME);
        return Cause.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Cause} proxy from a {@link Class} stereotyped << Cause >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Cause} proxy or <i>null</i>.
     */
    @objid ("8852d9c2-554d-4191-9edd-a1264070252f")
    public static Cause instantiate(final Class obj) {
        return Cause.canInstantiate(obj) ? new Cause(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Cause} proxy from a {@link Class} stereotyped << Cause >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Cause} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3dc795f3-6498-4e98-8e58-af2df394c6f9")
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
     */
    @objid ("a5f06414-7bce-4271-bf65-5134d756976e")
    public void addEventInstances(final EventInstance obj) {
        if (obj!=null)
          ((Class) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("4f4cbbc7-809c-4e63-9ef1-4ed080d328a2")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("07a4d5f4-c4ce-4311-b1cb-8b48ae9ef2b1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'eventInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("c4b3c5a9-0d19-49a9-921d-f05e3c3532dd")
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

    @objid ("f53880ed-5c19-4c69-b39d-bf8c4f173c54")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'eventInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("aeb8707a-6c06-4d3f-8259-f2edf35e69be")
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

    @objid ("ab078e74-ac40-45f5-9b2f-576c4e6bcd64")
    protected Cause(final Class elt) {
        super(elt);
    }

    @objid ("4715c654-3715-48a5-94ee-f2e266c99336")
    public static final class MdaTypes {
        @objid ("ca5efc5f-2e37-4222-9f53-f1acdbaf02fe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("04abe8d1-0982-4982-a777-f51f14f9d3ce")
        private static Stereotype MDAASSOCDEP;

        @objid ("40c2985c-6def-4e53-9f2d-bcb880cd71b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ea9c320-6dad-4fbe-8323-8c47ac5fe386")
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
