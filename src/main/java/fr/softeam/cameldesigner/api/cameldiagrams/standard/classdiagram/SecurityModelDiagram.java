/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << SecurityModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4718a895-acb3-4999-91d8-cabfc0237ba5")
public class SecurityModelDiagram extends AbstractCamelDiagram {
    @objid ("aea047ce-4e22-4c03-acce-be504586364e")
    public static final String STEREOTYPE_NAME = "SecurityModelDiagram";

    /**
     * Tells whether a {@link SecurityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << SecurityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0d1d8d64-3217-4a8c-94fa-2d8cae0781b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << SecurityModelDiagram >> then instantiate a {@link SecurityModelDiagram} proxy.
     * 
     * @return a {@link SecurityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("5c0d14d4-df66-4326-9107-105a95428aba")
    public static SecurityModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME);
        return SecurityModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link SecurityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << SecurityModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link SecurityModelDiagram} proxy or <i>null</i>.
     */
    @objid ("9c1de38e-17fe-461f-bb21-e72ea6a37ce0")
    public static SecurityModelDiagram instantiate(final ClassDiagram obj) {
        return SecurityModelDiagram.canInstantiate(obj) ? new SecurityModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << SecurityModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link SecurityModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("52fcb69b-ceeb-4df1-a2b2-f4db2cb2572a")
    public static SecurityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (SecurityModelDiagram.canInstantiate(obj))
            return new SecurityModelDiagram(obj);
        else
            throw new IllegalArgumentException("SecurityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3926f54d-9625-461b-815b-60c1a7d72eb2")
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
        SecurityModelDiagram other = (SecurityModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("cdfe5970-efc5-4975-8dcd-9c49bbfb2a39")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("98224d4f-efa6-4363-af2a-7f224a2f601b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("78f63251-e877-421f-8907-5a07a2605825")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("cb18a7ab-6173-486f-901e-39e87040c1ae")
    protected SecurityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("868740be-41f1-4107-b65a-5c1c718c6bd6")
    public static final class MdaTypes {
        @objid ("32a962ba-f5e5-47a2-a65e-362068c5a733")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a2aa304-6b74-4fe0-9ed3-e42f009a02a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("d3c75fb7-e38e-42e5-a19b-4caacece0666")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb295176-958a-47f6-8143-f9e671d86e7c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f7228862-f56b-49a6-a404-f06dcb6a08fa");
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
