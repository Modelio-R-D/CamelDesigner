/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("fbe74ab0-3cc1-426d-a34e-d43c31e64426")
=======
    @objid ("f3109d8c-ca06-4b28-92b0-5641a4358065")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "RawMetric";

    /**
     * Tells whether a {@link RawMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("9de077eb-d999-428e-b477-05d0cd60f8f0")
=======
    @objid ("ef12a478-8f16-477b-8b48-f7e3d8f15b60")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetric >> then instantiate a {@link RawMetric} proxy.
     * 
     * @return a {@link RawMetric} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("43d6dc2a-6725-4837-baa5-b1c7e7155354")
=======
    @objid ("1db1ae61-4897-4bb5-a770-d2ae0f6fa9a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("991f8815-911d-40db-b31b-54d1415f5e81")
=======
    @objid ("1e9f5a78-c0d5-41b1-8145-e0602fb60b23")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b6a2e1b5-437c-400b-aff5-3eb362bae567")
=======
    @objid ("91638761-531f-4502-a16d-0fa8dad1ab70")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RawMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetric.canInstantiate(obj))
        	return new RawMetric(obj);
        else
        	throw new IllegalArgumentException("RawMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("651ea750-d5b8-445a-9994-366806ab8d0b")
=======
    @objid ("b96554cc-f983-4281-9cbb-cf20136f4218")
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
        RawMetric other = (RawMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("3549b3ac-2057-45cf-880c-a02b7e570cb8")
=======
    @objid ("1db9eacf-4d3a-40f8-b7ad-d9c21afc208b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("21ebd49c-367f-4d22-9ec6-0a2ccc040f1d")
=======
    @objid ("8d4ef808-e2bb-4242-8ce4-2502e3efef77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("b421561a-5551-4d69-9ae8-a4ff1f4886c6")
=======
    @objid ("2d27ba7d-bddc-41e0-baa3-f608d2460c31")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected RawMetric(final Class elt) {
        super(elt);
    }

    @objid ("9403e058-8f41-410e-a153-e595cb37e02b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("f80bd929-9ba5-4c7a-9767-71a2fc89e272")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a809f096-3876-4cab-a2a0-41d60675ae6c")
        private static Stereotype MDAASSOCDEP;

        @objid ("4b01a789-63a4-4370-866d-c7ae279d3006")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("52bbd0ec-f74e-4a28-909a-f4f39711b032")
=======
        @objid ("0edff01a-d911-4b7c-9427-2e3169d6b6f7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43c929e5-9b24-4e2d-b3bf-2d80aa5fdd8c")
        private static Stereotype MDAASSOCDEP;

        @objid ("a0a426e3-8dcb-4f86-898f-b23846d86a73")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("06a61f0b-466f-4a96-b15c-baf4e605188c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
