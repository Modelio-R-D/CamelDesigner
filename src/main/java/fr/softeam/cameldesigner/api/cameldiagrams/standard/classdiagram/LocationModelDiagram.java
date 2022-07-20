/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("5ccefe9f-9686-4c1e-b888-a44a81f1670c")
    public static final String STEREOTYPE_NAME = "LocationModelDiagram";

    /**
     * Tells whether a {@link LocationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << LocationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ef81780d-1244-49ba-9e44-338ad8babbca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << LocationModelDiagram >> then instantiate a {@link LocationModelDiagram} proxy.
     * 
     * @return a {@link LocationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("ecd019fb-75b0-4c60-863f-8923890848ec")
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
    @objid ("b0925195-16df-4f05-a8e8-271cb75e0586")
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
    @objid ("dff51a03-4b54-42e9-a102-c4d2c2154d42")
    public static LocationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (LocationModelDiagram.canInstantiate(obj))
        	return new LocationModelDiagram(obj);
        else
        	throw new IllegalArgumentException("LocationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("191d87f2-4c22-46b7-8728-3a47ea2329b5")
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
    @objid ("f9e8c572-4555-4f3f-b82f-6824f9e804a7")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("fea26947-d2b0-4a35-8798-5d3eb41d2add")
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

    @objid ("69866c1e-c6bd-4fcb-b409-3e69e4f933fd")
    protected LocationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("d138d97f-c7b6-4d2d-8920-f01b2cc9522e")
    public static final class MdaTypes {
        @objid ("705f98c6-ad8c-4a27-a1d4-8343c435c7a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3893fe25-aee2-4ce5-ba01-cf3e1466f7be")
        private static Stereotype MDAASSOCDEP;

        @objid ("5bb3d148-495e-40e7-8f13-f066579edf6c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("13dd06c0-c524-4b80-af2e-3861cdaa3064")
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
