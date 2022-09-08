/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency;

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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << PropertyDependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("66e1dd55-fc1a-4daa-b03e-a10778bf9f73")
public class PropertyDependency extends CamelElement {
    @objid ("dc273a1f-092a-471d-912e-e20be1dffbd1")
    public static final String STEREOTYPE_NAME = "PropertyDependency";

    /**
     * Tells whether a {@link PropertyDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << PropertyDependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("17d703d4-61a9-4db8-bbc6-ece1f088c3c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << PropertyDependency >> then instantiate a {@link PropertyDependency} proxy.
     * 
     * @return a {@link PropertyDependency} proxy on the created {@link Dependency}.
     */
    @objid ("af89eee5-efb5-4544-a7dc-14103a5e286a")
    public static PropertyDependency create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME);
        return PropertyDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Dependency
     * @return a {@link PropertyDependency} proxy or <i>null</i>.
     */
    @objid ("192aa701-80de-4e23-8f83-f14b7ba57782")
    public static PropertyDependency instantiate(final Dependency obj) {
        return PropertyDependency.canInstantiate(obj) ? new PropertyDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Dependency}
     * @return a {@link PropertyDependency} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("efc6a9d4-f378-4b37-a70d-5a1ac8d07399")
    public static PropertyDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (PropertyDependency.canInstantiate(obj))
            return new PropertyDependency(obj);
        else
            throw new IllegalArgumentException("PropertyDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4d040911-59ec-408c-82db-866980e1c6b0")
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
        PropertyDependency other = (PropertyDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}.
     * 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("fede5732-431b-468e-9642-9c7d78340ea5")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("ccc2d61a-f0d1-47ae-99cc-8e00ff10b88d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cf3e9910-f949-41ac-bcae-e3a97c13976d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("8ea8f4a2-30bd-4cad-93d3-394bfede86d9")
    protected PropertyDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("ee885f54-f4e7-4fbc-9bb2-acd65bf59695")
    public static final class MdaTypes {
        @objid ("749f7ec0-e5ff-43a5-9591-b36961462ce5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0088a3fc-0d7a-4bed-ae2e-84ddfc2fe9ba")
        private static Stereotype MDAASSOCDEP;

        @objid ("45068c7f-eae3-40c4-99b9-6679656d6cb9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f58484c4-e719-4e18-870b-b10319407d02")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "738c4b6c-0cf3-4276-b6d9-7fe4ec31ff01");
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
