/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("9335a58f-9745-427a-ac62-98636d120d77")
    public static final String STEREOTYPE_NAME = "RawMetric";

    /**
     * Tells whether a {@link RawMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a9a2b3a0-c56e-4a70-a64e-ff9fe2afcb91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetric >> then instantiate a {@link RawMetric} proxy.
     * 
     * @return a {@link RawMetric} proxy on the created {@link Class}.
     */
    @objid ("05fc7322-df77-4f92-a155-36ff8cfc1a2e")
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
    @objid ("c49a52e1-669d-4c06-b18b-28fd0782cae1")
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
    @objid ("ee76d216-73d0-49fd-af98-d188be1e4475")
    public static RawMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetric.canInstantiate(obj))
            return new RawMetric(obj);
        else
            throw new IllegalArgumentException("RawMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f9ae80c0-220e-45a2-8959-eadc3e9f7ab3")
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
    @objid ("42bd66cd-e784-43c2-8ff3-1e3edba7d178")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("f4711cce-2bd4-432a-9be8-1392db16553e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1d2f0357-6956-4fd5-a140-3ce80db48c81")
    protected RawMetric(final Class elt) {
        super(elt);
    }

    @objid ("81809744-3f9a-44d9-8ed2-eb7b1d5a6939")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9403e058-8f41-410e-a153-e595cb37e02b")
    public static final class MdaTypes {
        @objid ("bcac4e23-9ba6-4dab-b4d6-dbfff237dc13")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("28504516-1de3-4676-9667-aff1356a8cf6")
        private static Stereotype MDAASSOCDEP;

        @objid ("21c8b83c-89f4-4bbb-a73c-00ec9186050b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd53c389-1a55-4e4b-b754-bdf6e2c84b6c")
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
