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
    @objid ("bf11fd85-90a3-4689-9817-bd804d31a817")
    public static final String STEREOTYPE_NAME = "RawMetric";

    /**
     * Tells whether a {@link RawMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("418fac3b-4e41-4c09-8a11-6da5f01d8aea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetric >> then instantiate a {@link RawMetric} proxy.
     * 
     * @return a {@link RawMetric} proxy on the created {@link Class}.
     */
    @objid ("7a088739-af00-45ee-a980-2d0d94489211")
    public static RawMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME);
        return RawMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RawMetric} proxy from a {@link Class} stereotyped << RawMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RawMetric} proxy or <i>null</i>.
     */
    @objid ("cebdb890-f077-4be0-84da-ebe2d0f28b0d")
    public static RawMetric instantiate(final Class obj) {
        return RawMetric.canInstantiate(obj) ? new RawMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RawMetric} proxy from a {@link Class} stereotyped << RawMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RawMetric} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("88121ec8-ac09-4c30-807f-42bb8b0a9711")
    public static RawMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetric.canInstantiate(obj))
        	return new RawMetric(obj);
        else
        	throw new IllegalArgumentException("RawMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05d33f54-a405-426d-99c8-3d67ca34483c")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8b509622-2af0-4cc9-afce-6fa2eaac413d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ddfbc034-9d20-47fb-a1eb-306611364000")
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

    @objid ("9d0025ab-4c45-46fa-87e2-92e980cd3d84")
    protected RawMetric(final Class elt) {
        super(elt);
    }

    @objid ("9403e058-8f41-410e-a153-e595cb37e02b")
    public static final class MdaTypes {
        @objid ("c448381c-0ea4-4893-bde1-0f27d72d2c3a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0756aa3-9b9b-40ca-bd7d-e712059284a9")
        private static Stereotype MDAASSOCDEP;

        @objid ("4baa7125-caae-4ff4-8392-ff065524a963")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("779b5631-b3be-47d1-a356-e38e4064433a")
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
