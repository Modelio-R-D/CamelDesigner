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
 * Proxy class to handle a {@link ClassDiagram} with << CamelModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2c59f838-a1e2-4ac9-bf6c-e229175cc354")
public class CamelModelDiagram extends AbstractCamelDiagram {
    @objid ("1edbcbc4-b518-4dbe-9007-7e0ed4af9994")
    public static final String STEREOTYPE_NAME = "CamelModelDiagram";

    /**
     * Tells whether a {@link CamelModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ba054718-6f9e-48f4-a9fa-ae56ec3c890e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelModelDiagram >> then instantiate a {@link CamelModelDiagram} proxy.
     * 
     * @return a {@link CamelModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("bcaff51c-df80-43a5-ab2d-22f9de290396")
    public static CamelModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME);
        return CamelModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link CamelModelDiagram} proxy or <i>null</i>.
     */
    @objid ("c3358747-683c-42e8-8515-ccc3740f6203")
    public static CamelModelDiagram instantiate(final ClassDiagram obj) {
        return CamelModelDiagram.canInstantiate(obj) ? new CamelModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link CamelModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7f03ed57-850a-41d7-8a0a-62671b027c92")
    public static CamelModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelModelDiagram.canInstantiate(obj))
            return new CamelModelDiagram(obj);
        else
            throw new IllegalArgumentException("CamelModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0de5bad1-cee4-4a16-b314-e0e69fa19bc2")
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
        CamelModelDiagram other = (CamelModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("52d84c27-42a8-4454-9f58-511421509993")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("bb1414c2-04de-4790-84fc-1ea40542e9ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5b21fb26-6961-4938-af13-561334ff9a3d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("759ba218-6471-4614-9867-5f1cf7c31ebd")
    protected CamelModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("4c4f1d52-c636-4b3b-a84c-7e0d2ad342f4")
    public static final class MdaTypes {
        @objid ("d0d431f8-5afe-49b1-a84e-4cf9e6c4ad4a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17cb0a76-5005-4777-b10f-e03c22d6a640")
        private static Stereotype MDAASSOCDEP;

        @objid ("d6a9e8b6-a4cb-40eb-865a-6b8ec5194f90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ca06c5a-0264-4abe-896c-3426377ed173")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eec7381e-4c61-4f7c-9a1c-210f2fe38377");
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
