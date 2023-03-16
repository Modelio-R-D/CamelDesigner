/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("8ec65749-d70f-4b33-b019-97a3c4aae737")
    public static final String STEREOTYPE_NAME = "LocationModelDiagram";

    /**
     * Tells whether a {@link LocationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << LocationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("427e90ca-01bd-4dac-a9ed-274e28639ea9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << LocationModelDiagram >> then instantiate a {@link LocationModelDiagram} proxy.
     * 
     * @return a {@link LocationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("b64dbfae-5fe3-4cce-a86b-54169ebe8b2c")
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
    @objid ("fa71490b-3661-4429-af6e-b076e185fedb")
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
    @objid ("c0b6c64e-1987-4651-850f-a1ddc1127bbb")
    public static LocationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (LocationModelDiagram.canInstantiate(obj))
        	return new LocationModelDiagram(obj);
        else
        	throw new IllegalArgumentException("LocationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ee03d38-cc18-44a6-80f4-9318a04281ce")
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
    @objid ("3a24f32f-ea40-4391-9ed3-3729c520df0e")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("af256906-049a-4e0b-9d21-274fe13d33f5")
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

    @objid ("e5ca8e32-27a9-4536-b156-1c2a2dd27009")
    protected LocationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("d138d97f-c7b6-4d2d-8920-f01b2cc9522e")
    public static final class MdaTypes {
        @objid ("0af1b16d-32d3-4d84-88a9-31a9cd550f45")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a2389c69-439d-4948-8f5e-b8370ca05a1e")
        private static Stereotype MDAASSOCDEP;

        @objid ("001cdc22-6560-4369-8baf-85bb4f99aa8e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4ebc2a1-6696-4ac2-a619-53728633e360")
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
