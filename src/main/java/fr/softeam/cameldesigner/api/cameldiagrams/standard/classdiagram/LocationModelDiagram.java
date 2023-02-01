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
 * Proxy class to handle a {@link ClassDiagram} with << LocationModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3bde63ac-785b-4593-8950-0fc92c6f6722")
public class LocationModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("c166dc9a-6f73-4c0a-ba43-1ca3fcbf6f1d")
=======
    @objid ("ea89ab59-8c23-4012-a225-033aaf7acf1f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "LocationModelDiagram";

    /**
     * Tells whether a {@link LocationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << LocationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("84cce691-0f54-4d01-9ab5-5ba57cc21c18")
=======
    @objid ("2f832a13-1cd0-4c31-847f-f7e1b2f6c38a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << LocationModelDiagram >> then instantiate a {@link LocationModelDiagram} proxy.
     * 
     * @return a {@link LocationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("bd2fcfb8-984a-408f-83ab-4595c6256dc0")
=======
    @objid ("68bb9e41-9e42-4ccc-8815-750fe48f9415")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LocationModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationModelDiagram.STEREOTYPE_NAME);
        return LocationModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link LocationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << LocationModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link LocationModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("a2c5c464-9ed7-4fe8-b035-d9b8b713b4cc")
=======
    @objid ("c8d505d3-861f-492f-8cee-a38d078c41de")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LocationModelDiagram instantiate(final ClassDiagram obj) {
        return LocationModelDiagram.canInstantiate(obj) ? new LocationModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << LocationModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link LocationModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("0d5917c0-e937-4e49-8ee4-638487596642")
=======
    @objid ("0c2e481b-958d-4d25-b5e6-7495d435fe8c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LocationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (LocationModelDiagram.canInstantiate(obj))
        	return new LocationModelDiagram(obj);
        else
        	throw new IllegalArgumentException("LocationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("053df65d-a6f8-4152-87d3-afa7d35bd85c")
=======
    @objid ("8f7a87cf-a6cb-44b4-930b-d058072dff13")
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
        LocationModelDiagram other = (LocationModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("aa9423f6-50dd-4a75-94a9-4c7cf866a0b9")
=======
    @objid ("9e16168d-e774-463c-9d52-7cf846f9bdc2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("980099f9-aef6-4973-8802-9fc96b397700")
=======
    @objid ("8124bcac-29b2-4a9c-ab7b-95743b4fd928")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fd741bec-775c-4873-9001-673c976e3fe4")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("b0b67245-7dd2-486d-ae4a-1a670a7bf875")
=======
    @objid ("10abf7d7-7e79-42e3-bbe7-0a6775d51a25")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected LocationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("d138d97f-c7b6-4d2d-8920-f01b2cc9522e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("bccb025b-3d24-417c-b73d-d63a810e215d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4903d0a-6f23-41d3-9ca7-e10aef0567d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f0c4bf3-e53a-4c20-83c7-5828ccb039be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1ff79f4-5f46-4351-8077-2ebd1e420dfe")
=======
        @objid ("38aa5ca0-3695-4e58-abff-3b70c2baddf1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("403d6c35-c896-4902-9f67-5e33c2c6a3bb")
        private static Stereotype MDAASSOCDEP;

        @objid ("46bda1cc-73f9-4c9f-b615-6c9b251b66f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53d6fd36-5d09-442c-b84c-7ae8b5127b83")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8417972e-6235-45f0-b45e-8f6202da12d9");
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
