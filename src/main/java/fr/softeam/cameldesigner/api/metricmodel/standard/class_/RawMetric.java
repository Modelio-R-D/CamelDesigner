/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("c586b2c0-aa49-45a7-b75e-25b1eba3217e")
    public static final String STEREOTYPE_NAME = "RawMetric";

    /**
     * Tells whether a {@link RawMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e9942a67-5df5-4c0f-ae9e-b47db5390657")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetric >> then instantiate a {@link RawMetric} proxy.
     * 
     * @return a {@link RawMetric} proxy on the created {@link Class}.
     */
    @objid ("f74ef608-553f-4771-b6f0-3571309c14df")
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
    @objid ("4432d983-244c-4b44-a4bb-bc45e1479f07")
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
    @objid ("00275417-1fd1-4a68-91c7-b6b533d1b7e4")
    public static RawMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetric.canInstantiate(obj))
        	return new RawMetric(obj);
        else
        	throw new IllegalArgumentException("RawMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3946aca-0ede-4357-b9a2-371f31366686")
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
    @objid ("97e77d19-bbee-46c1-8ca6-fcbf9d3dd6cb")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("c82fb68d-d3d1-4a75-ab18-69dabaf24693")
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

    @objid ("4ec5fbad-2f3a-4ff3-8db7-3d19dedf0e69")
    protected RawMetric(final Class elt) {
        super(elt);
    }

    @objid ("9403e058-8f41-410e-a153-e595cb37e02b")
    public static final class MdaTypes {
        @objid ("258a98c8-40bd-4093-8aa0-2a99bb58a752")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2748c0d7-50dc-4ea6-aae4-492304db0460")
        private static Stereotype MDAASSOCDEP;

        @objid ("b3d944e4-b526-462a-82fd-5be0c975efb2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf6fb581-9379-468e-8a1d-210337a6baa2")
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
