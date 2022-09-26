import type { CSSProperties } from 'vue';
declare const _default: import("vue").DefineComponent<{
    readonly size: import("element-plus/es/utils").BuildPropReturn<readonly [NumberConstructor, StringConstructor], "default", unknown, "default" | "small" | "large", number>;
    readonly shape: import("element-plus/es/utils").BuildPropReturn<StringConstructor, "circle", unknown, "circle" | "square", unknown>;
    readonly icon: import("element-plus/es/utils").BuildPropReturn<import("element-plus/es/utils").PropWrapper<string | import("vue").Component<any, any, any, import("vue").ComputedOptions, import("vue").MethodOptions>>, unknown, unknown, unknown, unknown>;
    readonly src: import("element-plus/es/utils").BuildPropReturn<StringConstructor, "", unknown, unknown, unknown>;
    readonly alt: StringConstructor;
    readonly srcSet: StringConstructor;
    readonly fit: import("element-plus/es/utils").BuildPropReturn<import("element-plus/es/utils").PropWrapper<import("csstype").ObjectFitProperty>, "cover", unknown, unknown, unknown>;
}, {
    hasLoadError: import("vue").Ref<boolean>;
    avatarClass: import("vue").ComputedRef<string[]>;
    sizeStyle: import("vue").ComputedRef<CSSProperties | undefined>;
    fitStyle: import("vue").ComputedRef<CSSProperties>;
    handleError: (e: Event) => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {
    error: (evt: Event) => boolean;
}, string, import("vue").VNodeProps & import("vue").AllowedComponentProps & import("vue").ComponentCustomProps, Readonly<import("vue").ExtractPropTypes<{
    readonly size: import("element-plus/es/utils").BuildPropReturn<readonly [NumberConstructor, StringConstructor], "default", unknown, "default" | "small" | "large", number>;
    readonly shape: import("element-plus/es/utils").BuildPropReturn<StringConstructor, "circle", unknown, "circle" | "square", unknown>;
    readonly icon: import("element-plus/es/utils").BuildPropReturn<import("element-plus/es/utils").PropWrapper<string | import("vue").Component<any, any, any, import("vue").ComputedOptions, import("vue").MethodOptions>>, unknown, unknown, unknown, unknown>;
    readonly src: import("element-plus/es/utils").BuildPropReturn<StringConstructor, "", unknown, unknown, unknown>;
    readonly alt: StringConstructor;
    readonly srcSet: StringConstructor;
    readonly fit: import("element-plus/es/utils").BuildPropReturn<import("element-plus/es/utils").PropWrapper<import("csstype").ObjectFitProperty>, "cover", unknown, unknown, unknown>;
}>> & {
    onError?: ((evt: Event) => any) | undefined;
}, {
    icon: import("element-plus/es/utils").BuildPropType<import("element-plus/es/utils").PropWrapper<string | import("vue").Component<any, any, any, import("vue").ComputedOptions, import("vue").MethodOptions>>, unknown, unknown>;
    size: import("element-plus/es/utils").BuildPropType<readonly [NumberConstructor, StringConstructor], "default" | "small" | "large", number>;
    shape: import("element-plus/es/utils").BuildPropType<StringConstructor, "circle" | "square", unknown>;
    src: string;
    fit: import("element-plus/es/utils").BuildPropType<import("element-plus/es/utils").PropWrapper<import("csstype").ObjectFitProperty>, unknown, unknown>;
}>;
export default _default;
