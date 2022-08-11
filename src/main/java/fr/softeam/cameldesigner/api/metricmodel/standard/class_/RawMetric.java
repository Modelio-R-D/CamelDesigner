/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << RawMetric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("572cad03-96ad-4628-9ea6-cb55bb5f2e80")
public class RawMetric extends Metric {
    @objid ("51d7c814-e2e6-426f-91fb-3239dbf97199")
    public static final String STEREOTYPE_NAME = "RawMetric";

    /**
     * Tells whether a {@link RawMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d0db002f-41dc-487f-be23-24b50d071b34")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetric >> then instantiate a {@link RawMetric} proxy.
     * 
     * @return a {@link RawMetric} proxy on the created {@link Class}.
     */
    @objid ("05944681-1f07-4d58-aeab-46e599fdf60f")
    public static RawMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME);
        return RawMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RawMetric} proxy from a {@link Class} stereotyped << RawMetric >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link RawMetric} proxy or <i>null</i>.
     */
    @objid ("9e479f5c-4977-4058-b7c2-3943370b9a46")
    public static RawMetric instantiate(final Class obj) {
        return RawMetric.canInstantiate(obj) ? new RawMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RawMetric} proxy from a {@link Class} stereotyped << RawMetric >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link RawMetric} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0492bb55-1a2a-4369-aa84-ca60ec72451a")
    public static RawMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetric.canInstantiate(obj))
            return new RawMetric(obj);
        else
            throw new IllegalArgumentException("RawMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("474b3cb4-9319-41af-bd06-145e572b33a7")
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
        RawMetric other = (RawMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c49687cf-5624-418c-87d0-1ca4fc5b5cb2")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("96d6c39b-5a94-455c-aab2-bc7194131960")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("81809744-3f9a-44d9-8ed2-eb7b1d5a6939")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("71555536-2041-4d72-87e4-c88f77a9ecfb")
    protected RawMetric(final Class elt) {
        super(elt);
    }

    @objid ("9403e058-8f41-410e-a153-e595cb37e02b")
    public static final class MdaTypes {
        @objid ("9ce67298-ad5a-4f25-893c-1cd06e76df27")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3848c98-8f33-46d8-9f89-fb72b9c428e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a16034bf-fc64-4685-bd38-c327356044bf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("17a4409f-5c77-451e-b7de-510ccdd096b7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e0501b-37c4-4e17-af3c-6a30e6ad9290");
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
