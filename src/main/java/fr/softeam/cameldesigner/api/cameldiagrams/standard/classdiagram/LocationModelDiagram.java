/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("e860b786-14ff-4fd2-a953-44d60ea81623")
    public static final String STEREOTYPE_NAME = "LocationModelDiagram";

    /**
     * Tells whether a {@link LocationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << LocationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("470c1b1d-7748-4f9a-b6c5-6601a4609405")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << LocationModelDiagram >> then instantiate a {@link LocationModelDiagram} proxy.
     * 
     * @return a {@link LocationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("03d1bd91-6f5f-4931-a046-6bd8c8b345cf")
    public static LocationModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationModelDiagram.STEREOTYPE_NAME);
        return LocationModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link LocationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << LocationModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link LocationModelDiagram} proxy or <i>null</i>.
     */
    @objid ("d7037782-591b-4329-a83d-c2a35eeb8308")
    public static LocationModelDiagram instantiate(final ClassDiagram obj) {
        return LocationModelDiagram.canInstantiate(obj) ? new LocationModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << LocationModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link LocationModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("637f17f1-b85b-4018-91d2-0052de7f4fe0")
    public static LocationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (LocationModelDiagram.canInstantiate(obj))
            return new LocationModelDiagram(obj);
        else
            throw new IllegalArgumentException("LocationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5adee3e3-e09b-4dfd-b5a9-a37e11c65c1e")
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
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("e319e24d-fa06-4386-9437-6a4c09598ea8")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("2ea51940-df2d-429d-b51b-1d4c85369340")
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

    @objid ("dd251713-c097-4f65-bd0d-14ccd5dad758")
    protected LocationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("d138d97f-c7b6-4d2d-8920-f01b2cc9522e")
    public static final class MdaTypes {
        @objid ("afdca893-57db-45c2-b8a1-27b346773c90")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb58a7b8-89a0-4289-b681-ca6d893f0b07")
        private static Stereotype MDAASSOCDEP;

        @objid ("b79fb94b-b531-498f-83ef-01555ca920a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24004e0a-31bd-4075-839b-bc630a4072b9")
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
