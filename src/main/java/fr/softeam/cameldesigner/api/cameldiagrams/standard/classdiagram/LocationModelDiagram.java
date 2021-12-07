/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("989684ce-6640-4c54-93a6-6154ab9adaea")
    public static final String STEREOTYPE_NAME = "LocationModelDiagram";

    /**
     * Tells whether a {@link LocationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << LocationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("73ffebc3-7889-4ffc-a993-1fbc7cf9b665")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << LocationModelDiagram >> then instantiate a {@link LocationModelDiagram} proxy.
     * 
     * @return a {@link LocationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("05516499-cbb3-430c-8bc9-da259a142129")
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
    @objid ("b7dac744-b26b-4f75-a5f7-22b4d81307db")
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
    @objid ("ce834c86-5cc0-4a9b-a733-59fc66b0a8aa")
    public static LocationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (LocationModelDiagram.canInstantiate(obj))
            return new LocationModelDiagram(obj);
        else
            throw new IllegalArgumentException("LocationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4a5c9fb9-e03c-4c99-a78f-84ae2fe58dc5")
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
    @objid ("c0018161-540e-4a12-822c-34888e740f8e")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("4a583682-a33f-48d7-a4cc-72d9f9d9e06c")
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

    @objid ("e9e4d04a-2ed7-4da8-8afa-189d68007f87")
    protected LocationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("d138d97f-c7b6-4d2d-8920-f01b2cc9522e")
    public static final class MdaTypes {
        @objid ("8fe76747-65b2-4bca-a993-80560a368d7a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e5fe0b0-fd70-47ec-8381-aa503e84e555")
        private static Stereotype MDAASSOCDEP;

        @objid ("e18a37ae-d138-44d7-a342-6d24019dffea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a972a0e-c968-41c8-81f8-e854b7fd7dbd")
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
