/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << MetricTypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("81ac3cd7-8152-40ff-a197-efdeebea3e78")
public class MetricTypeModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("14bfbee2-8d6d-47d4-b537-a9a605b2228b")
=======
    @objid ("93b43476-3787-4432-90fb-e126984fe4ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetricTypeModelDiagram";

    /**
     * Tells whether a {@link MetricTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("e54392fb-9c64-4dc0-9c36-b5eb39100421")
=======
    @objid ("f3521442-d21c-4404-a294-ee7c6323287b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >> then instantiate a {@link MetricTypeModelDiagram} proxy.
     * 
     * @return a {@link MetricTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("72179317-ca90-4e6e-84f6-c264541d09a8")
=======
    @objid ("be97bd58-fdc1-422f-9f77-5c682768c2e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MetricTypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModelDiagram.STEREOTYPE_NAME);
        return MetricTypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetricTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link MetricTypeModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("5b14071a-dd37-4b74-b320-1de98d2a2bc0")
=======
    @objid ("deaa8e4c-c3c1-4494-b8ec-40c9b08fd249")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MetricTypeModelDiagram instantiate(final ClassDiagram obj) {
        return MetricTypeModelDiagram.canInstantiate(obj) ? new MetricTypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetricTypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("4f7cfd14-8df7-4f6a-b3b8-1a521a105059")
=======
    @objid ("18886b55-512d-47a0-b005-ace59f3a026c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MetricTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricTypeModelDiagram.canInstantiate(obj))
        	return new MetricTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("838a3100-f2d5-49b0-961b-eef91a2579f6")
=======
    @objid ("5f8375e1-0435-4a72-9892-b7b226e29b79")
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
        MetricTypeModelDiagram other = (MetricTypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c65812d7-c961-4612-953f-4c23641d628e")
=======
    @objid ("398dbbd4-793f-4136-be0a-c4f963819662")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("536fcd21-4793-4d70-bd02-17335a605532")
=======
    @objid ("54e506a8-fb31-497c-be09-fe9c3cd55041")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aa755ca9-3bfd-40d6-a6e8-7a40b609ae27")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("80a93670-4e0c-4ea1-8288-b780a3ae8384")
=======
    @objid ("3e3d1aeb-41df-4ffc-9a1e-19f5bb001b3f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetricTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("6ae7d73a-b368-4659-bddf-37a608de833c")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c98dcfd6-acdd-46ee-86d8-0d9390db004d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc5e5da9-81d7-420d-bc38-26d1949f633c")
        private static Stereotype MDAASSOCDEP;

        @objid ("1519f4f5-c5b4-4b76-8d23-191045e97dba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bde56f00-6049-42e5-9fed-c85c099fbed3")
=======
        @objid ("e6c39b6e-caf2-4d9b-882a-21d8c39bc87d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ec821e7-80cc-4be9-8a36-8c3ff82b0edb")
        private static Stereotype MDAASSOCDEP;

        @objid ("72ede8b8-c069-4832-b5f1-3e031482d8da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b9291e6e-b005-4060-b878-ba01ba8193e8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41062298-9e86-4073-b4a8-713719cfcf90");
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
